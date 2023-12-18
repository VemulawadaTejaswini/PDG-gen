import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        String[] nums=new String[h];
        for(int i=0;i<h;i++){
            nums[i]=sc.next();
        }
        int[][] output=new int[h][w];
        int[] x={1,1,0,-1,-1,-1,0,1};
        int[] y={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(nums[i].charAt(j)=='#'){
                    output[i][j]=-1;
                    continue;
                }
                for(int k=0;k<8;k++){
                    try{
                        if(nums[i+x[k]].charAt(j+y[k])=='#')output[i][j]++;
                    }catch(Exception e){}
                }
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(output[i][j]>=0?output[i][j]:"#");
            }
            System.out.println();
        }
    }
}