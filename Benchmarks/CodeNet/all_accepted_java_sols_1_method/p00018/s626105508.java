import java.util.*;	
public class Main {
	public static void main(String[] args) {
					Scanner in =new Scanner(System.in).useDelimiter("[^0123456789-]+");
					int []a=new int[5];
					for(int i=0;i<a.length;i++){
						a[i]=in.nextInt();
					}
					Arrays.sort(a);
					for (int i = a.length-1; i >=1; i--) {
						System.out.print(a[i]+" ");
					}
					System.out.println(a[0]);
						
					in.close();
			}
	
	}
