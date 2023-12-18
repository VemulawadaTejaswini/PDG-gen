import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        boolean[][]nums=new boolean[h+1][w+1];
        String tmp;
        for(int i=0;i<h;i++){
            tmp=sc.next();
            for(int j=0;j<w;j++){
                nums[i][j]=tmp.charAt(j)=='.';
            }
        }
        int[][] hs=new int[h+1][w];
        int[][] ws=new int[h][w+1];
        int begin;
        int length;
        for(int i=0;i<h;i++){
            begin=-1;
            length=0;
            for(int j=0;j<w+1;j++){
                if(nums[i][j]){
                    if(begin==-1)begin=j;
                    length++;
                }else{
                    for(int k=begin;k<begin+length;k++){
                        ws[i][k]=length;
                    }
                    begin=-1;
                    length=0;
                }
            }
        }
        for(int i=0;i<w;i++){
            begin=-1;
            length=0;
            for(int j=0;j<h+1;j++){
                if(nums[j][i]){
                    if(begin==-1)begin=j;
                    length++;
                }else{
                    for(int k=begin;k<begin+length;k++){
                        hs[k][i]=length;
                    }
                    begin=-1;
                    length=0;
                }
            }
        }
        int ans=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                ans=Math.max(hs[i][j]+ws[i][j],ans);
            }
        }
        System.out.println(ans-1);
    }
}