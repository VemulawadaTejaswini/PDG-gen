import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
				while(true){
					String tmp = scan.nextLine();
					int m,f,r;
					m = Integer.parseInt(tmp.split(" ")[0]);
					f =Integer.parseInt(tmp.split(" ")[1]);
					r = Integer.parseInt(tmp.split(" ")[2]);
					if(m == -1 && f == -1 && r == -1){
						break;
					}
					if(m == -1 || f == -1){
						System.out.println("F");
						continue;
					}
					if(m + f < 30){
						System.out.println("F");
						continue;
					}
					if(m + f >= 30 && m + f < 50){
						if(r >= 50){
							System.out.println("C");
							continue;
						}else{
							System.out.println("D");
							continue;
						}
					}
					if(m + f >= 50 && m + f < 65){
						System.out.println("C");
						continue;
					}
					if(m + f >= 65 && m + f < 80){
						System.out.println("B");
						continue;
					}
					if(m + f >= 80){
						System.out.println("A");
						continue;
					}
				}

    }

}

