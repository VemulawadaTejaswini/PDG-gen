import java.util.Scanner;
public class Main{
	public static void main(String[] args){

        Scanner s = new Scanner(System.in);
		int n,i;
        n = s.nextInt();
        int[] gya=new int[n];		//逆列
        
        for(i=0;i<gya.length;i++){
			n = s.nextInt();
            gya[i]=n;
        }
        for(i=gya.length-1;i>=0;i--){
System.out.print(gya[i]);
        if(i!=0)System.out.print(" ");
        else System.out.println();
}
            
       
		s.close();
	}
}
