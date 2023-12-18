class Hello{
    public static void main(String[] args){
        int x;
        
        x = 100;
        
        for(int i=0; i<2; i++){
            x *= x;
        }
        
        System.out.println(x);
    }
}