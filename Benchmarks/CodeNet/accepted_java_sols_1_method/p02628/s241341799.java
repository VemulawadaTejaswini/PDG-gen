import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int j=0;j<num;j++){
            sum=sum+arr[j];

        }
        System.out.println(sum);
    }
    
}