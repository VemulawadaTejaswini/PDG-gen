    import java.util.Scanner;
     
     
    public class Main{
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
     
    		int n=Integer.parseInt(sc.next());
            int count=0;
            int max=0;

            for(int i=0; i<n; i++) {
                int h = sc.nextInt();
                if(h >= max) {
                    count++;
                    max = h;
                }
            }


            System.out.println(count);
    	}
     
    }
