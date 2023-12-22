import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] cities = new long[num+1];
        long[] heroes = new long[num];
        for(int i=0;i<num+1;i++)
            cities[i]=sc.nextLong();
        for(int i=0;i<num;i++)
            heroes[i]=sc.nextLong();
        long count=0;
        long x=0;
        for(int i=0;i<num;i++)
        {
            x = Math.min(cities[i], heroes[i]);
            heroes[i] -= x;
            count += x;
            x = Math.min(cities[i+1], heroes[i]);
            cities[i+1] -= x;
            count += x;
        }
        System.out.println(count);
    }
}