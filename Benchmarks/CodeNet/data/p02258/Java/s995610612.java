public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int [] a =new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int maxV=a[1]-a[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = a[j]-a[i];
                if(temp>maxV){
                    maxV=temp;
                }
            }
        }
        System.out.println(maxV);
    }
}