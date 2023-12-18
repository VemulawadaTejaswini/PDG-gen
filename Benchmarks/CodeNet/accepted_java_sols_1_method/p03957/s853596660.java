import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);


        String tmp = in.nextLine();
        
        int ans =0;
        for(int i=0;i<tmp.length();i++){
        	if(ans==0&&tmp.charAt(i)=='C')
        		ans=1;
        	if(ans==1&&tmp.charAt(i)=='F')
        		ans=2;
        }
        if(ans==2)
        	System.out.println("Yes");
        else
        	System.out.println("No");
	        

	}

}
