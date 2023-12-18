import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Integer a[] = new Integer[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        int ans = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if (a[k]<a[i]+a[j]){
                        ans++;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
