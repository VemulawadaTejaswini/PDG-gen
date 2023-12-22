import java.util.Scanner;

public class Main{
	 
    public static void main(String[] args) {
        Scanner stdin  = new Scanner(System.in);
        
        int num = Integer.parseInt(stdin.nextLine());
        
        boolean boo = true;
        int[] seq = new int[num];
        if(num <= 100) {
         
        	for(int i = 0;i < num;i++) {
        		seq[i] = stdin.nextInt();
        		if(seq[i] >= 0 && seq[i] <= 1000) {
        			continue;
        		}else {
        			boo = false;
                break;
        		}
        	}
        }
         
        if(boo == true) {
            for(int j = num ;j > 0;j--) {
                if(j != 1) {
                    System.out.print(seq[j - 1]+" ");
                }else {
                    System.out.println(seq[j - 1]);
                }
            }
        }
       stdin.close();  
   }
	 
}