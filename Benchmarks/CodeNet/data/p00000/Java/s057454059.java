using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace supermanse
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 1;
            int b = 1;
            int c;
            for (; ; )
            {
                c = a * b;
                Console.WriteLine("" + a + "x" + b + "=" + c + "");
                b++;
                if (b == 10) { a++; b = 1; }
                if (a == 10) { break; }
            }
        }
    }
}