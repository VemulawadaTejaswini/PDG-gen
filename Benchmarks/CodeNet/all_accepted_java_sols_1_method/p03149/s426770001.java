import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=0;
        ArrayList<Integer> List = new ArrayList<>();
        for(int a=0;a<4;a++) List.add(sc.nextInt());
        if(List.contains(1)==true) num++;
        if(List.contains(9)==true) num++;
        if(List.contains(7)==true) num++;
        if(List.contains(4)==true) num++;

        if(num==4) System.out.println("YES");
        else System.out.println("NO");
    }
}