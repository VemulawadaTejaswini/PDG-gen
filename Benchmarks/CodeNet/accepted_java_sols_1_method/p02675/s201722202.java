public class Main {
	public static void main(String[] args) {
        int hon[] = {2,4,5,7,9};
        int pon[] = {0,1,6,8};
        int N = new java.util.Scanner(System.in).nextInt();
        N = N%100;
        N = N%10;
        
        for(int i: hon){
            if(N == i) System.out.println("hon");
        }
        for(int i: pon){
            if(N == i) System.out.println("pon");
        }
        if(N == 3) System.out.println("bon");
    }
}