import java.util.*;
class Main{
    static public void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        
        double pie = (double)22/7;
        System.out.println(pie*2*R - 0.01);
    }
}