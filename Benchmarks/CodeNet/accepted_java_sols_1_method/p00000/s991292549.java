class Main{
    public static void main(String[] a){
        int[] b = {1,2,3,4,5,6,7,8,9};
        int sum=0;

        for(int i=0; i<9; i++){
           for(int n=0; n<9; n++){
             sum = b[i] * b[n];
             System.out.println(b[i]+"x"+b[n]+"="+sum);
           }
        }
    }
}