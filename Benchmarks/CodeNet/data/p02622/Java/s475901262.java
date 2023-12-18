class a
{
  public static void main(String args[])
  {
    String s,t;
  int count=0,i,l;
  cin>>s;
  cin>>t;
    l=s.length;
  for(i=0;i<l;i++)
  {
    if(s[i]!=t[i])
    {
      count++;
    }
  }
  cout<<count;
  }
}
