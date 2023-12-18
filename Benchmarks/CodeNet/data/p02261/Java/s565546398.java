import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        String[] a=new String[n];
        String[] b=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            b[i]=a[i];
        }
        bubblesort(a,n);
        selectionsort(b,n);
    }
private static void bubblesort(String[] a,int n){
        for(int i=0;i<=n-1;i++){
            for(int j=n-1;j>=i+1;j--){
                if(Character.getNumericValue(a[j].charAt(1))<
                        Character.getNumericValue(a[j-1].charAt(1))){
                    String t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
            }
        }
        for(int i=0;i<n-1;i++) System.out.print(a[i]+" ");
        System.out.println(a[n-1]);
        System.out.println("Stable");
    }
private static void selectionsort(String[] a,int n){
        boolean isStable=true;
        for(int i=0;i<=n-1;i++){
            int minj=i;
            for(int j=i;j<=n-1;j++){
                if(Character.getNumericValue(a[j].charAt(1))<
                        Character.getNumericValue(a[minj].charAt(1))) minj=j;
            }
            for(int k=i+1;k<minj;k++){
                if(Character.getNumericValue(a[i].charAt(1))==
                        Character.getNumericValue(a[k].charAt(1))){
                    isStable=false; 
                    break;
                }
            }
            String t=a[i];
            a[i]=a[minj];
            a[minj]=t;
        }
        for(int i=0;i<n-1;i++) System.out.print(a[i]+" ");
        System.out.println(a[n-1]);
        if(isStable) System.out.println("Stable");
        else System.out.println("Not stable");
    }
}