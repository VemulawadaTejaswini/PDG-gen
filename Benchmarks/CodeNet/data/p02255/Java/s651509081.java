import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        build(a);
        for(int i = 1; i < a.length; i++){
            int v = a[i];
            int j = i-1;
            while(j >=0 && a[j] > v){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            build(a);
        }
    }
    
    public static void build(int[] a){
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            out.append(a[i]);
            if(i < a.length-1){
                out.append(" ");
            }
        }
        out.append("\n");
        System.out.print(out.toString());
    }
}