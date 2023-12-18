import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = Integer.MAX_VALUE;
        l:for(;;){
            int n = sc.nextInt();
            if(n==0)break;
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                String s = sc.next();
                if(s.equals("x")){
                    a[i]=x;
                } else {
                    a[i]=Integer.parseInt(s);
                }
            }
            for (int i = 0; i < a.length; i++) {
                if(i<a.length-1)
                    if(a[i]==a[i+1]){
                        System.out.println("none");
                        continue l;
                    }
                if(a[i]==x)continue;
                if(i==0){
                    if(a[i]>=a[i+1]){
                        System.out.println("none");
                        continue l;
                    }
                    continue;
                }
                if(i==a.length-1){
                    if(i%2==0){
                        if(a[i]>=a[i-1]){
                            System.out.println("none");
                            continue l;
                        }
                    } else {
                        if(a[i]<=a[i-1]){
                            System.out.println("none");
                            continue l;
                        }
                    }
                    continue;
                }
                if(i%2==0){
                    if(a[i]>=a[i-1] || a[i] >= a[i+1]){
                        System.out.println("none");
                        continue l;
                    }
                } else {
                    if(a[i]<=a[i-1] || a[i]>=a[i+1]){
                        System.out.println("none");
                        continue l;
                    }
                }
                
                
            }
            // odd smaller
            int bigger = Integer.MAX_VALUE-1;
            int smaller= Integer.MIN_VALUE+1;
            for (int i = 0; i < a.length; i++) {
                if(a[i]!=x){
                    continue;
                }
                if(i%2==1){
                    if(i==0){
                        bigger= Math.min(bigger, a[i+1]+1);
                    } else if(i==a.length-1){
                        bigger= Math.min(bigger, a[i-1]+1);
                    } else {
                        bigger= Math.min(bigger, Math.max(a[i-1], a[i+1])+1);
                    }
                } else {
                    // smaller than neibor
                    if(i==0){
                        smaller= Math.max(smaller, a[i+1]-1);
                    } else if(i==a.length-1){
                        smaller= Math.max(smaller, a[i-1]-1);
                    } else {
                        smaller = Math.max(smaller, Math.min(a[i-1], a[i+1])-1);
                    }
                }
            }
//            System.out.println(smaller +" "+bigger);
            if(bigger==Integer.MAX_VALUE-1 || smaller == Integer.MIN_VALUE+1){
                System.out.println("ambiguous");
            } else if(bigger == smaller){
                System.out.println(bigger);
            } else if(bigger<smaller){
                System.out.println("ambiguous");
            } else {
                System.out.println("none");
            }
        }
    }

}