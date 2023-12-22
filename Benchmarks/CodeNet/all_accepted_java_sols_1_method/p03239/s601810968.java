import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int limit=scn.nextInt();
        int minCost=1001;
        for(int i=0;i<n;i++){
            int cost=scn.nextInt();
            int time=scn.nextInt();
            if(limit>=time){
                if(minCost>cost) minCost=cost;
            }
        }
        if(minCost==1001){
            System.out.println("TLE");
        }else{
            System.out.println(minCost);
        }
    }
}