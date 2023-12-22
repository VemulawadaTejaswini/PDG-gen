import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[] distance = new int[3];
        
        for (int i = 0; i < 3; i++) {
            distance[i] = sc.nextInt();
        }
        
        Arrays.sort(distance);
        
        System.out.println(distance[0] + distance[1]);
        
    }
}