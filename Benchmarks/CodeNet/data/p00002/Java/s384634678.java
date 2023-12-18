class Main{
    public static void main(String[] args){
        double totalNumber = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
        int count = 0;
        if(totalNumber==0){
            count=1;
        }else{
            while(totalNumber>=1){
                totalNumber = totalNumber/10;
                count++;
            }
        }
        System.out.println(count);
    }
}