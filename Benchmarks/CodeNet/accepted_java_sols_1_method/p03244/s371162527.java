import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] odd=new int[1000001];
        int[] even=new int[1000001];
        for(int i=0;i<odd.length;i++){
            odd[i]=0; even[i]=0;
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[sc.nextInt()]++;
            }
            else{
                odd[sc.nextInt()]++;
            }
        }
        int odd1=0; int odd1_idx=0; int odd2=0; int odd2_idx=0;
        int even1=0; int even1_idx=0; int even2=0; int even2_idx=0;
        for(int i=1;i<1000001;i++){
            if(odd[i]>odd1){
                odd2_idx=odd1_idx; odd2=odd1;
                odd1_idx=i; odd1=odd[i];
            }
            else if(odd[i]>odd2){
                odd2_idx=i; odd2=odd[i];
            }
            if(even[i]>even1){
                even2_idx=even1_idx; even2=even1;
                even1_idx=i; even1=even[i];
            }
            else if(even[i]>even2){
                even2_idx=i; even2=even[i];
            }
        }
        if(odd1==n/2 && even1==n/2 && odd1_idx!=even1_idx){
            System.out.println(0);
        }
        else if(odd1==n/2 && even1==n/2 && odd1_idx==even1_idx){
            System.out.println(n/2);
        }
        else if(odd1==n/2 || even1==n/2){
            int out=odd1==n/2 ? n/2-even1 : n/2-odd1;
            System.out.println(out);
        }
        else if(odd1_idx!=even1_idx){
            System.out.println(n-odd1-even1);
        }
        else{
            if(odd1-odd2>even1-even2)
                System.out.println(n-even2-odd1);
            else
                System.out.println(n-odd2-even1);
        }
    }
}
