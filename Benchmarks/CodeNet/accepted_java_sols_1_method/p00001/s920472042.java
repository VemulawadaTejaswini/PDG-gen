public class Main{
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] h = new int[10];
        for(int i=0;i<10;i++){
            h[i] = sc.nextInt();
        }
        java.util.Arrays.sort(h);
        for(int i=h.length-1;i>=7;i--){
            System.out.println(h[i]);
        }
    }
}