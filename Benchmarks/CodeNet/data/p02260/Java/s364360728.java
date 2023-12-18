import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] List = new int [N];
        for(int i=0;i<N;i++) List[i] = sc.nextInt();
        int num = 0;
        for(int i=0;i<N-1;i++){
            int min = List[i];
            int min_num = i;
            boolean check = false;
            for(int j=i+1;j<N;j++){
                if(min > List[j]){
                    min = List[j];
                    min_num = j;
                    check = true;
                }
            }
            List[min_num] = List[i];
            List[i] = min;
            if(check) num++;
        }
        for(int i=0;i<N;i++) {
            System.out.print(List[i]);
            if(i<N-1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(num);
    }
}
