import java.util.*;

public class Main {
    static boolean[] bits;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Queue<Integer> queue=new PriorityQueue<>();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        int tmp;
        for(int i=-1;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                if(n-(j-i-1)>k)continue;
                tmp=0;
                for(int l=0;l<=i&&l>-1;l++){
                    tmp+=nums[l];
                    queue.add(nums[l]);
                }
                for(int l=j;l<n&&l>-1;l++){
                    tmp+=nums[l];
                    queue.add(nums[l]);
                }
                for(int l=0;l<k-n+(j-i-1)&&queue.size()>0&&queue.peek()<0;l++){
                    tmp-=queue.poll();
                }
                ans=Math.max(ans,tmp);
                queue=new PriorityQueue<>();
            }
        }
        System.out.println(ans);
    }
    
}
