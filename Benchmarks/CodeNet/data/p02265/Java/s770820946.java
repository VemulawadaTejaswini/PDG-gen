class Main{
    public static void main(String[] args){
    	int cnt=  Integer.parseInt(args[0]);

        System.out.println(args.length);

        for (int x = 1; x < cnt; x++) {
            System.out.println(args[x]);
        }
        
        return;
    }
}
