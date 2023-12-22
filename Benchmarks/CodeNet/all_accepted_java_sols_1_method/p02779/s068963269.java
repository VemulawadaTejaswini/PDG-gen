import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        boolean check = true;
        for(int i=0;i<N;i++) List.add(sc.nextInt());
        Collections.sort(List);
        for(int i=0;i<N-1;i++){
            if(List.get(i+1)-List.get(i)==0){
                check = false;
                break;
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
    }
}