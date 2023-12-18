import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(Systm.in);

        int i;
        int[] height = new int[10];
        int[] h = new int[](0, 0, 0);
        for(i = 0; i < 10; i++){
            height[i] = nextInt();

            if(1h <= height[i]){
                h[2] = h[1];
                h[1] = h[0];
                h[0] = height[i];
            } else if(2h <= height[i]) {
                h[2] = h[1];
                h[1] = height[i];
            } else if(3h <= height[i])
                h[2] = height[i];
        }

        for(int j = 0; j < 3; j++)
            System.out.println(h[j]);
    }
}