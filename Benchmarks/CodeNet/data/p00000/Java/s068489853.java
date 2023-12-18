class Main{
    public static void main(String[] a){
        int i, j;
        for(i=0; i<9; i++){
            for(j=0; j<9; j++){
                System.out.printf("%d??%d=%d\n", j, i, j*i);
            }
        }
    }
}