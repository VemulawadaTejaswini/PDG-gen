import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                String r = s.next();
                int n = r.length();
                int i=0,j=0,k=0,z=0,t=0;
                for(i=0;i<n;i++){

                  int l = r.charAt(i);
                     if(r.charAt(0)=='A'){
                        j=1;
                     }
                     if((i>=2 && i<n-1) && r.charAt(i)=='C'){
                        k=1;
                        t++;
                     }
                     if(l==65 || l==67 || (l>=97 && l<=122)){
                        z=1;
                     }else{
                        z=0;
                        break;
                     }
                     

                }
                if(j==1 && k==1 && z==1 && t==1){
                  System.out.println("AC");
                }else{
                  System.out.println("WA");
                }
                
	}
}
