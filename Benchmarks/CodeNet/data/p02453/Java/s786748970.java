import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        int n[]=new int[test];
        for (int i = 0; i < test; i++) {
            n[i]=in.nextInt();
        }
        int query=in.nextInt();
        for (int i = 0; i <query; i++) {
            int x=in.nextInt();
            int check=0;
        int right=test-1,left=0,mid=0,rifat=0;
        while(left<=right){
            mid=(left+right)/2;
            if(n[mid]==x || x<n[mid]){
                check=1;
                rifat=mid;
            }
            if(n[mid]<x){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(check==0){
            System.out.println(n.length);
        }
        else{
            System.out.println(rifat);
        }
        }
    }
}
