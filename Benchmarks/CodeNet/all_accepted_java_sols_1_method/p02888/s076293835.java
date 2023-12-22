import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        int [] List = new int[N];
        for(int i=0;i<N;i++) List[i]=sc.nextInt();
        Arrays.sort(List);
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++)
                    if(List[i]+List[j]>List[k]) num++;
                    else break;
            }
        }
        System.out.println(num);
    }
}