import java.util.*;
public class Main {
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int n,m;
	   char c;
	   for(;;){
	       n= sc.nextInt();
	       if(n==0){
		       return;
	       }
	       char[][] ch=new char[n][2];
	       for(int i=0;i<n;i++){
		       ch[i][0]=sc.next().charAt(0);
		       ch[i][1]=sc.next().charAt(0);
	       }
	       m=sc.nextInt();
	       for(int i=0;i<m;i++){
		       c=sc.next().charAt(0);
		       for(int j=0;j<n;j++){
			       if(c==ch[j][0]){
				       System.out.print(ch[j][1]);
				       break;
			       }else if(j==n-1){
				       System.out.print(c);
			       }
		       }
	       }
	       System.out.println();
	   }
   }
}
