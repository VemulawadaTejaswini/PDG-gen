class Main{
    public static void main(String[] args){
        int[] tops = {0,0,0};
        for(String hightStr:args){
            int hight = Integer.parseInt(hightStr);
            if(tops[0]<=hight){
                tops[2]=tops[1];
                tops[1]=tops[0];
                tops[0]=hight;
                continue;
            }
            if(tops[1]<=hight){
                tops[2]=tops[1];
                tops[1]=hight;
                continue;
            }
            if(tops[2]<=hight){
                tops[2]=hight;
            }
        }
        for(int top:tops){
            System.out.println(top);
        }
    }
}