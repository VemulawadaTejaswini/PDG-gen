import java.util.*;
class Main {
    final  static int[] rate = {399,799,1199,1599,1999,2399,2799,3199};
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] color = new boolean[8];
        int freeColorCount=0;
        for(int i = 0;i<n;i++) {
            a[i] = sc.nextInt();
            for(int j = 0;j<rate.length;j++){
                if(a[i]<=rate[j]){
                    color[j] =true;
                    break;
                }
                if(a[i]>rate[rate.length-1]){
                    freeColorCount++;
                    break;
                }
            }
        }
        int ans= 0;
        for(int i = 0;i<color.length;i++)if(color[i])ans++;
        System.out.print(ans==0?1:ans);
        System.out.println(" "+(ans+freeColorCount));
    }
}
