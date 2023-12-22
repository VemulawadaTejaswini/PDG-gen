import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N,M;
    N=sc.nextInt();
    M=sc.nextInt();
    int [] num_road = new int[N];
    for(int a=0;a<M;a++){
        int a_city =sc.nextInt();
        int b_city =sc.nextInt();
        num_road[a_city-1]++;
        num_road[b_city-1]++;
    }
    for(int b=0;b<N;b++){
        System.out.println(num_road[b]);
    }

}
}
