class Main{
    public static void main(String[] a){
       int[] b = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
       int i=0;
       for(; i<b.length-1; i++){
            for(int j=i+1; j<b.length; j++){
                if(b[j]>b[i]){
                    int t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
       }
       
       for(int c=0; c<b.length; c++){
        if(b[c]>=2800)
        {
            System.out.println(b[c]);
        }
       }
    }
}