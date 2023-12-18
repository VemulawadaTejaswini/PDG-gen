    import java.util.Scanner;
    import java.util.Arrays;
     
    public class Main
    {
     
    	public static void main(String[] args)
    	{	Scanner s = new Scanner(System.in);
                    int l = s.nextInt();
                    int i=0,k=0;
                    if(l%2==0){
                      k = l/2;
                       System.out.print(k*k);
                    }else{
                      k = l/2;
                      i = k*l - k*k;
                       System.out.print(i);
                    }
                    
                         
                    
    	}
    }