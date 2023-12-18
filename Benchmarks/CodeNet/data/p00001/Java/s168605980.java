class Main{
    public static void main(String[] a){
        int list[] = {
              1819
            , 2003
            , 876
            , 2840
            , 1723
            , 1673
            , 3776
            , 2848
            , 1592
            , 922
        };

        int index;
        for(index=0;index<3;index++) {
            System.out.println(max(list));
        }
    }
    
    private int max(int[] list) {
        int max = 0;
        int index;
        int maxIndex;
        for(index=0;index<list.length;index++) {
          if (list[index] > max) {
             max = list[index];
             maxIndex = index;
          }
        }
        list[maxIndex] = 0;
        return max;
    }
}