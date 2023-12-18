import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int[] s=new int[n+1];
		 int count=0;
		 for(int i=0; i<n; i++){
			 s[i]=sc.nextInt();
		 }
		 int q=sc.nextInt();
		 int[] t=new int[q];
		 for(int i=0; i<q; i++){
			 t[i]=sc.nextInt();
		 }
		 for(int i=0; i<q; i++){
			 if(linears(s,t[i])!=-1){
				 count++;
			 }
		 }
		 System.out.println(count);

	}
	public static int linears(int[] s,int key){
		int i=-1;

		for(int j=0; j<s.length; j++){
			if(s[j]==key){
				i=j;
				break;
			}
		}

		return i;
	}


}
