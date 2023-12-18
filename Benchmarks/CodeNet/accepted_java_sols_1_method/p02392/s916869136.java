import java.util.Scanner;
class Main{
    public static void main(String[] args){
        String[] x = null;
        Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		x = ip.split(" ", 0);
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = Integer.parseInt(x[2]);

		if(a<b && b<c){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
    }
}

