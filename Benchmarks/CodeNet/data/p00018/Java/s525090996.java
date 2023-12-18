rt java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =new int[5];
        for (int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[4]+" "+a[3]+" "+a[2]+" "+a[1]+" "+a[0]);
    }
}