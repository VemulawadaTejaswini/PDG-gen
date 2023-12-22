import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] is = {in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.sort(is);
        System.out.println(is[0]+" "+is[1]+" "+is[2]);
    }
}