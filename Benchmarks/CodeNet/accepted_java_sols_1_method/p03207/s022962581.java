import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        for(int j=0;j<arr.length;j++) {
            if(j==arr.length-1) {
                sum=sum+arr[j]/2;
            } else {
                sum =sum+arr[j];
            }
            
        }
        System.out.println(sum); 
    }
}