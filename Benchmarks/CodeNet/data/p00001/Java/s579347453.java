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

        int i,index,hoge;
        int max = 0;
        for(i=0;i<3;i++){
          for(index=0;index<list.length;index++){
              if(list[index]>max){
                  max = list[index];
                  hoge = index;
              }
              System.out.println(max);
              list[hoge] = 0;
          }
        }
    }
}