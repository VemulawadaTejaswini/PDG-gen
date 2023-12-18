class Watch{
    int a,b;
         
    public void solve(){
        int S = 46979,h,m,s;
        
        h = S / 3600;
        m = (S - h * 3600) / 60;
        s = S - (h * 3600 + m * 60);
        System.out.println(h + ":" + m + ":" + s);
         
    }
     
    public static void main(String[] args){
         
        new Watch().solve();
                 
    }
 
}