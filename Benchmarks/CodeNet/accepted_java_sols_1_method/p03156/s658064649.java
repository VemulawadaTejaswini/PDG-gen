import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int []problems= new int[N];
        
        int []low = new int[N];
        int []mid = new int[N];
        int []high = new int[N];
        int lowc = 0;
        int midc = 0;
        int highc = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<N; ++i) {
            int val = sc.nextInt();
            if(val <= A) {
                low[lowc] = val;
                ++lowc;

            }else if (val > A && val <=B) {
                mid[midc] = val;
                ++midc;

            }else if (val > B) {
                high[highc] = val;
                ++highc;  

            }
            problems[i] = val;
            
        }
      /*
        int total = (lowc+1) * (midc+1) * (highc+1);
        for(int i : low) {
            
            if(i == 0) {
                break;
            }
            System.out.println(i +" is less than "+A);
        }
        for(int i : mid) {
            
            if(i == 0) {
                break;
            }            
            System.out.println(i +" is between "+A +" and "+B);
        }
        for(int i : high) {
            
            if(i == 0) {
                break;
            }
          System.out.println(i +" is higher than "+B);
        }*/
		min = Math.min(Math.min(lowc, midc), highc);
        System.out.println(min);
/*      System.out.println(lowc);
      System.out.println(midc);
      System.out.println(highc);*/
    }

}

