import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		int i=1;
		int[] a = new int[10001];	
		Scanner scan = new Scanner(System.in);
		while(true){		
            a[i] = Integer.parseInt(scan.next());
            if(a[i]==0){
				break;
			}
            i++;
		}
		i=1;
		while(true){
			if(a[i]==0){
				break;
			}
			System.out.println("case"+ i+":"+a[i]);
			i++;
		}
	}
} 