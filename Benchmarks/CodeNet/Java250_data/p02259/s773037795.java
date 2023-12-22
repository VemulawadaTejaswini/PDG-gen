import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        int z = sc.nextInt();
        int[] ary = new int[z];
        for(int i = 0 ; i < ary.length; i++){
            ary[i] = sc.nextInt();
        }
        int count = 0;
        for(int j = 0; j < ary.length; j++){
            for(int i = ary.length-1; i > j; i--){
                if(ary[i] < ary[i-1]){
                    int temp = ary[i];
                    ary[i] = ary[i-1];
                    ary[i-1] = temp;
                    count++;
                }
            }
        }
        for(int i = 0; i < ary.length; i++){
            build.append(ary[i]);
            build.append(i==ary.length-1 ? "\n" : " ");
        }
        build.append(count);
        System.out.println(build.toString());
    }
}