import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[] nData = new int[n];
            int[] mData = new int[m];
            int nSum=0,mSum=0;
            for (int i = 0; i < n; i++) {
                nData[i] = scan.nextInt();
                nSum=nSum+nData[i];
            }
            for (int i = 0; i < m; i++) {
                mData[i] = scan.nextInt();
                mSum=mSum+mData[i];
            }
            boolean flag=false;
            int nAns=1000,mAns=1000;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(nSum-nData[i]+mData[j]==mSum-mData[j]+nData[i]){
                        if(!flag){
                            nAns=nData[i];
                            mAns=mData[j];
                        }
                        if(nAns+mAns>nData[i]+mData[j]){
                            nAns=nData[i];
                            mAns=mData[j];
                        }
//                        System.out.println(nData[i]+" "+mData[j]);
//                        System.out.println(hoge+" "+fuga);
                        flag=true;
                    }
                }
            }
            if(!flag){
                System.out.println("-1");
            }
            else {
                System.out.println(nAns+" "+mAns);
            }
        }
    }
}
