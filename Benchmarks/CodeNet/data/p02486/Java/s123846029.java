import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		while(true){
				String[] s = sc2.nextLine().split("[\\s]+");
				int n = Integer.parseInt(s[0]);
				int x = Integer.parseInt(s[1]);
				int count = 0;
				
				if(n == 0 && x == 0) break;
				else{
					for(int i=1;i<=n;i++){
						for(int h=1;h<=n;h++){
							if(h==i)break;
							for(int g=1;g<=n;g++){
								if(i==g || h==g) break;
								else if(i+h+g == x) count++;
							}
						}
					}
					System.out.println(count);
				}
		}
	}
}