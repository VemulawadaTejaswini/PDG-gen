import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
            build.append(a[i]);
            if(i == a.length-1){
                build.append("\n");
            }else{
                build.append(" ");
            }
        }
        for(int i = 1; i < a.length; i++){
            int v = a[i];
            int j = i-1;
            while(j >=0 && a[j] > v){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            for(int k = 0; k < a.length; k++){
                build.append(a[k]);
                if(k == a.length-1){
                    build.append("\n");
                }else{
                    build.append(" ");
                }
            }
        }
        System.out.println(build);
    }
}