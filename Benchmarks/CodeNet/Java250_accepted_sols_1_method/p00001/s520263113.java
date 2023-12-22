import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []height = new int[10];
        for(int i =0;i<height.length;i++){
            height[i]=sc.nextInt();
           
        }
        Arrays.sort(height);
        for (int j=9;6<j;j--){
            System.out.println(height[j]);
        }

    }
}